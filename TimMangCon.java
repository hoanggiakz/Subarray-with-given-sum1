import java.util.ArrayList;

public class TimMangCon {
    public static void main(String[] args) {
        int[] mang = {1, 2, 3, 7, 5};
        int S = 12;

        ArrayList<Integer> ketQua = timMangCon(mang, S);

        System.out.println("Vi Tri: " + ketQua.get(0) + " " + ketQua.get(1));
    }

    private static ArrayList<Integer> timMangCon(int[] mang, int S) {
        ArrayList<Integer> ketQua = new ArrayList<>();

        int tong = 0;
        int batDau = 0;

        for (int i = 0; i < mang.length; i++) {
            tong += mang[i];

            while (tong > S) {
                tong -= mang[batDau];
                batDau++;
            }

            if (tong == S) {
                // Tìm thấy mảng con có tổng bằng S
                ketQua.add(batDau + 1); 
                ketQua.add(i + 1);      
                return ketQua;
            }
        }

        
        ketQua.add(-1);
        return ketQua;
    }
}
