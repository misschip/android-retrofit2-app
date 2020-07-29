package com.pyj.retrofit2ex01;

import java.util.List;
import lombok.Data;

@Data
public class Yts {
    private String status;
    private String statusMessage;
    private Data data;
    private Meta meta;

    @lombok.Data
    public class Data {
        private Integer movieCount;
        private Integer limit;
        private Integer pageNumber;
        private List<Movie> movies = null;

        @lombok.Data
        public class Movie {
            private Integer id;
            private String url;
            private String imdbCode;
            private String title;
            private String titleEnglish;
            private String titleLong;
            private String slug;
            private Integer year;
            private Double rating;
            private Integer runtime;
            private List<String> genres = null;
            private String summary;
            private String descriptionFull;
            private String synopsis;
            private String ytTrailerCode;
            private String language;
            private String mpaRating;
            private String backgroundImage;
            private String backgroundImageOriginal;
            private String smallCoverImage;
            private String mediumCoverImage;
            private String largeCoverImage;
            private String state;
            private String dateUploaded;
            private Integer dateUploadedUnix;
        }
    }

    @lombok.Data
    public class Meta {
        private Integer serverTime;
        private String serverTimezone;
        private Integer apiVersion;
        private String executionTime;
    }
}