package ru.kseniamedvedeva.segmentlengthapp.service;

public class SegmentLength {
    public static double calculatingLenghtOfSegment(int x1, int y1, int x2, int y2) {
        double lenght = (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return Math.sqrt(lenght);
    }
}