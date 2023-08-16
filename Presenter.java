package presenter;
import model.Make_vector;
import view.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Presenter {
    Make_vector makeVector ;
    View view ;

    public Presenter(Make_vector makeVector, View view){
        this.makeVector = makeVector;
        this.view = view;
    }

    public void run(){

        view.setVisible(true);




    }


    public static void main(String[] args) {
        Make_vector makeVector = new Make_vector();
        View view = new View();
        Presenter presenter = new Presenter(makeVector, view);
        presenter.run();

    }
}
