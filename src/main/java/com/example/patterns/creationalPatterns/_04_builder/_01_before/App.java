package com.example.patterns.creationalPatterns._04_builder._01_before;

import com.example.patterns.creationalPatterns._04_builder._02_after.DefaultTourBuilder;
import com.example.patterns.creationalPatterns._04_builder._02_after.TourDirector;
import com.example.patterns.creationalPatterns._04_builder._02_after.TourPlanBuilder;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TourPlanBuilder builder = new DefaultTourBuilder();

        TourPlan plan = builder.title("칸쿤여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 10, 2))
                .whereToStay("hotel")
                .addPlan(0, "저녁 식사")
                .addPlan(1, "아침 식사")
                .getPlan();

        TourPlan longBeachTrip = builder.title("롱비치")
                .startDate(LocalDate.now())
                .getPlan();

        TourPlan tourPlan = DefaultTourBuilder.Builder("title").getPlan();

        // Director를 사용해 프로세스가 구성되어 사용하는 코드로 바뀌게 된다.
        TourDirector director = new TourDirector(builder);

        TourPlan cancun = director.cancunTrip();
        TourPlan longBeach = director.longBeachTrip();
    }
}
