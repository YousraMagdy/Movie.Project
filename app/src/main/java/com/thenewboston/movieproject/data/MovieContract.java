package com.thenewboston.movieproject.data;

/**
 * Created by Owner on 20/09/2016.
 */
import android.provider.BaseColumns;

/**
 * Defines table and column names for the weather database.
 */
public class MovieContract {



    /*
        Inner class that defines the contents of the movies table
     */


    /* Inner class that defines the contents of the weather table */
    public static final class MovieEntry implements BaseColumns {

        public static final String TABLE_NAME = "movie";


        public static final String COLUMN_Mov_KEY = "movie_id";

        public static final String COLUMN_Name = "name";

        public static final String COLUMN_TITLE = "movie_title";


    }
}