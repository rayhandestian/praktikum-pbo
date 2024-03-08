public class Lambda {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A" -> System.out.println("Woooow Anda lulus dengan baik");
            case "B", "C" -> System.out.println("Ente lulus");
            case "D" -> System.out.println("Yah Anda tidak lulus :(");
            default -> {
                System.out.println("Mungkin Anda salah jurusan awokawok");
            }
        }

        var nilai2 = "B";

        String ucapan = switch (nilai2) {
            case "A":
                yield "Woooow Anda lulus dengan baik";
            case "B", "C":
                yield "Ente lulus";
            case "D":
                yield "Yah Anda tidak lulus :(";
            default:
                yield "Mungkin Anda salah jurusan awokawok";
        };
        
        System.out.println(ucapan);
    }
}
