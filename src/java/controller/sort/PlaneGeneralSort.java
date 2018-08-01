package controller.sort;


import model.Plane;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
/**
 * ������������. ���������� �������� ���������. ������� ������������.
 * ��������� ����� ����������� � ����������������. �������� ����������
 * ��������� �������� �� ��������� ������. ����� ������� � ��������, ��-
 * ������������� ��������� ��������� ���������� ����������� ��������.
 */

/**
 * Created by ������������ on 28.08.2015.
 */
public class PlaneGeneralSort implements Comparator<Plane> {

    List<Comparator<Plane>> criterions;

    public PlaneGeneralSort(Comparator<Plane>... criterions) { // constructor
        this.criterions = Arrays.asList(criterions);
    }

    public int compare(Plane o1, Plane o2) {
        if (o1 != null & o2 != null) {
            for (Comparator<Plane> comparator : criterions) {
                int result = comparator.compare(o1, o2);
                if (result != 0) {
                    return result;
                }
            }
        } else System.err.println("Object <Plane> might been initialized!");
        return 0;
    }
}

