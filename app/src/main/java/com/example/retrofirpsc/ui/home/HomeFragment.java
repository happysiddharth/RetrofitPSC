package com.example.retrofirpsc.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import com.example.retrofirpsc.R;
import com.example.retrofirpsc.model.ComingSoonDTO;
import com.example.retrofirpsc.model.NowShowingDTO;
import com.example.retrofirpsc.model.ResponseDTO;
import com.example.retrofirpsc.network.adaptor.ComingSoonAdaptor;
import com.example.retrofirpsc.network.adaptor.NewMovieAdaptor;
import com.example.retrofirpsc.network.endpoints.EndPoints;
import com.example.retrofirpsc.network.service.Network;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeFragment extends Fragment {

    private ArrayList<ComingSoonDTO> comingSoon = new ArrayList<>();
    private ArrayList<NowShowingDTO> NowShowing = new ArrayList<>();
    private RecyclerView recyclerView;
    private ViewPager2 viewPager2;
    private NewMovieAdaptor movieAdaptor;
    private ProgressBar progress;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        setUpRecyclerView();
        makeNetworkCall();
    }

    private void makeNetworkCall() {
        EndPoints endPoints = Network.mujheRetroFitDo().create(EndPoints.class);

        endPoints.getMovies().enqueue(new Callback<ResponseDTO>() {
            @Override
            public void onResponse(Call<ResponseDTO> call, Response<ResponseDTO> response) {
                NowShowing.addAll(response.body().getNowShowing());
                movieAdaptor.notifyDataSetChanged();

                comingSoon.addAll(response.body().getComingSoon());
                viewPager2.setAdapter(
                        new ComingSoonAdaptor(
                                comingSoon
                        )
                );
                progress.setVisibility(View.GONE);


            }

            @Override
            public void onFailure(Call<ResponseDTO> call, Throwable t) {

            }
        });
    }

    private void setUpRecyclerView() {
        movieAdaptor = new NewMovieAdaptor(NowShowing);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        recyclerView.setAdapter(movieAdaptor);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    private void initView(View view) {
        recyclerView = view.findViewById(R.id.recylerView);
        viewPager2 = view.findViewById(R.id.comingSoonVP);
        progress = view.findViewById(R.id.progress);
    }
}