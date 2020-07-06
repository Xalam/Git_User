package com.example.githubuser.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.example.githubuser.Adapter.GithubUserAdapter;
import com.example.githubuser.GithubUser;
import com.example.githubuser.GithubUserData;
import com.example.githubuser.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private ArrayList<GithubUser> list = new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.rv_github);
        recyclerView.setHasFixedSize(true);
        list.addAll(GithubUserData.getData());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GithubUserAdapter githubUserAdapter = new GithubUserAdapter(list);
        recyclerView.setAdapter(githubUserAdapter);

        LayoutAnimationController animationController = AnimationUtils.loadLayoutAnimation(getActivity(), R.anim.layout_fall_down);
        recyclerView.setLayoutAnimation(animationController);
    }
}
