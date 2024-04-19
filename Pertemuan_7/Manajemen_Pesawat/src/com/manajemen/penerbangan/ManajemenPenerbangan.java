package com.manajemen.penerbangan;

import java.util.ArrayList;

public class ManajemenPenerbangan {
    private ArrayList<Penerbangan> penerbangan;
    private static int totalPenerbangan;

    public ManajemenPenerbangan() {
        this.penerbangan = new ArrayList<>();
        this.totalPenerbangan = 0;
    }

    public void tambahPenerbangan(Penerbangan penerbangan) {
        this.penerbangan.add(penerbangan);
        this.totalPenerbangan++;
    }

    public Penerbangan cariPenerbangan(String kodePenerbangan) {
        for (Penerbangan penerbangan : this.penerbangan) {
            if (penerbangan.getKodePenerbangan().equals(kodePenerbangan)) {
                return penerbangan;
            }
        }
        return null;
    }

    public ArrayList<Penerbangan> filterPenerbangan(String status) {
        ArrayList<Penerbangan> hasil = new ArrayList<>();
        for (Penerbangan p : penerbangan) {
            if (p.getStatus().equals(status)) {
                hasil.add(p);
            }
        }
        return hasil;
    }

    public static int getTotalPenerbangan() {
        return totalPenerbangan;
    }
}
