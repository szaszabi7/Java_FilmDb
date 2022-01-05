package hu.petrik.filmdb;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;
import java.util.List;

public class MainController {

    @FXML
    private TableView<Film> filmTable;
    @FXML
    private TableColumn<Film, String> colCim;
    @FXML
    private TableColumn<Film, String> colKategoria;
    @FXML
    private TableColumn<Film, Integer> colHossz;
    @FXML
    private TableColumn<Film, Integer> colErtekeles;

    public void initialize() {
        colCim.setCellValueFactory(new PropertyValueFactory<>("cim"));
        colKategoria.setCellValueFactory(new PropertyValueFactory<>("kategoria"));
        colHossz.setCellValueFactory(new PropertyValueFactory<>("hossz"));
        colErtekeles.setCellValueFactory(new PropertyValueFactory<>("ertekeles"));
        try {
            FilmDb db = new FilmDb();
            List<Film> filmList = db.getFilmek();
            for (Film film:db.getFilmek()) {
                filmTable.getItems().add(film);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    @FXML
    public void onHozzaadasButtonClick(ActionEvent actionEvent) {
    }

    @FXML
    public void onModositasButtonClick(ActionEvent actionEvent) {
    }

    @FXML
    public void onTorlesButtonClick(ActionEvent actionEvent) {
    }
}