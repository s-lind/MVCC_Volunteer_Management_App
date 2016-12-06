package com.miamivineyard.sagrariogrullon.mvcc_volunteer_management_app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Sagrario Grullon on 12/5/2016.
 */

public class DevotionalsFeed {

    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> dailyBibleReadings = new ArrayList<String>();
        dailyBibleReadings.add("Daily Bible Reading for Wednesday Dec 7th, 2016.");
        dailyBibleReadings.add("Daily Bible Reading Question for Wednesday Dec 7th, 2016.");

        List<String> inspirations = new ArrayList<String>();
        inspirations.add("Inspirational Quotes to Live By From Pastor Abdy.");
        inspirations.add("Pastor Nick's Latest Tips.");

        expandableListDetail.put("Daily Bible Readings", dailyBibleReadings);
        expandableListDetail.put("Inspiration", inspirations);
        return expandableListDetail;
    }
}