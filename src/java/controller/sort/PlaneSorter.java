package controller.sort;


import controller.sort.PlaneGeneralSort;
import model.Plane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ������������ on 29.08.2015.
 */
public class PlaneSorter {
    public static void planesSort(List cmp, PlaneGeneralSort... criterions) {
        for (int i = 0; i < criterions.length; i++) {
            Collections.sort(cmp, criterions[i]);
        }
    }
    public static void sortByOne(List cmp, PlaneGeneralSort criterion) {
        Collections.sort(cmp, criterion);
    }

    public static Plane planeMax(List cmp, PlaneGeneralSort criterion) { // TODO!!!!!!!!!!!!!!!!!!!!!!
        List<Plane> temp = new ArrayList();
        temp.addAll(cmp);
        Plane max = null;
        max = Collections.max(temp, criterion);
        return max;
    }

    public static Plane planeMin(List cmp, PlaneGeneralSort criterion) { // TODO!!!!!!!!!!!!!!!!!!!!!!
        List<Plane> temp = new ArrayList();
        temp.addAll(cmp);
        Plane min = null;
        min = Collections.min(temp, criterion);
        return min;
    }
}
