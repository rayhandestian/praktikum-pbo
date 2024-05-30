public class ChildClass extends ParentClass {
    private String attribute = "Ini atribut child";

    public void showAttribute() {
        super.showAttribute(); // panggil method showAttribute() dari class ParentClass
        System.out.println(this.attribute); // tampilkan attribute dari class ChildClass
    }
}
