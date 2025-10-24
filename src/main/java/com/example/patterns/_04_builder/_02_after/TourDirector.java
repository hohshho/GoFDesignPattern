package com.example.patterns._04_builder._02_after;

import com.example.patterns._04_builder._01_before.TourPlan;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip() {
        return tourPlanBuilder
                .title("칸쿤여행")
                .nightsAndDays(2, 3)
                .addPlan(0, "체크인하고 짐 풀기")
                .getPlan();
    }

    public TourPlan longBeachTrip() {
        return tourPlanBuilder
                .title("긴해변여행")
                .nightsAndDays(2, 3)
                .addPlan(0, "체크인하고 짐 풀기")
                .getPlan();
    }
}
