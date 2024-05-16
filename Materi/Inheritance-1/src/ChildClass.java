public class ChildClass extends ParentClass {
    private String attribute = "Ini atribut child";

    public void showAttribute() {
        super.showAttribute(); // Memanggil method showAttribute() dari class ParentClass
        System.out.println(this.attribute); // Menampilkan attribute dari class ChildClass
    }
}
