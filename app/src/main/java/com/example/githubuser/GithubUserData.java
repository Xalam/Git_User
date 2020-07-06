package com.example.githubuser;

import java.util.ArrayList;

public class GithubUserData {
    private static String[] userName = {
            "JakeWharton",
            "amitshekhariitbhu",
            "romainguy",
            "chrisbanes",
            "tipsy",
            "ravi8x",
            "jasoet",
            "budioktaviyan",
            "hendisantika",
            "sidiqpermana"
    };

    private static String[] fullName = {
            "Jake Wharton",
            "Amit Shekhar",
            "Romain Guy",
            "Chris Banes",
            "David",
            "Ravi Tamada",
            "Deny Prasetyo",
            "Budi Oktaviyan",
            "Hendi Santika",
            "Sidiq Permana"
    };

    private static String[] location = {
            "Pittsburgh, PA, USA",
            "New Delhi, India",
            "California",
            "Sydney, Australia",
            "Trondheim, Norway",
            "India",
            "Kotagede, Yogyakarta, Indonesia",
            "Jakarta, Indonesia",
            "Bojongsoang - Bandung Jawa Barat",
            "Jakarta Indonesia"
    };

    private static int[] repository = {
            102,
            37,
            9,
            30,
            56,
            28,
            44,
            110,
            1064,
            65
    };

    private static String[] company = {
            "Google, Inc.",
            "MindOrksOpenSource",
            "Google",
            "Google working on @android",
            "Working Group Two",
            "AndroidHive | Droid5",
            "gojek-engineering",
            "KotlinID",
            "JVMDeveloperID @KotlinID @IDDevOps",
            "Nusantara Beta Studio"
    };

    private static int[] followers = {
            56995,
            5153,
            7972,
            14725,
            788,
            18628,
            277,
            178,
            428,
            465
    };

    private static int[] following = {
            12,
            2,
            0,
            1,
            0,
            3,
            39,
            23,
            61,
            10
    };

    private static int[] avatar = {
            R.drawable.user1,
            R.drawable.user2,
            R.drawable.user3,
            R.drawable.user4,
            R.drawable.user5,
            R.drawable.user6,
            R.drawable.user7,
            R.drawable.user8,
            R.drawable.user9,
            R.drawable.user10
    };

    public static ArrayList<GithubUser> getData() {
        ArrayList<GithubUser> list = new ArrayList<>();
        for (int position = 0; position < userName.length; position++) {
            GithubUser githubUser = new GithubUser();
            githubUser.setUserName(userName[position]);
            githubUser.setFullName(fullName[position]);
            githubUser.setLocation(location[position]);
            githubUser.setRepository(repository[position]);
            githubUser.setCompany(company[position]);
            githubUser.setFollowers(followers[position]);
            githubUser.setFollowing(following[position]);
            githubUser.setAvatar(avatar[position]);
            list.add(githubUser);
        }
        return list;
    }
}
