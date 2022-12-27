package F.Interface_Segregation_Principle;

public interface Resizable {
    void resize(int size);
    void resize(int x , int y);
    void resize(UIWidget widget);
}
