package libreria.Service;

import libreria.Entity.Autor;
import libreria.Entity.Editorial;
import libreria.Entity.Libro;
import libreria.Persistence.DAO;
import libreria.Persistence.EditorialDAO;

public class EditorialService{

    private EditorialDAO editorialDAO;

    //Inicializamos en el constructor
    public EditorialService (){
        editorialDAO = new EditorialDAO();
    }

    public void saveEditorial (Editorial editorial){ //Ya no recibe un autor sino un objeto de tipo editorial para persistir
        editorialDAO.save(editorial);
    }

    public void removeEditorial (Editorial editorial){
        editorial.setAlta(false);
        editorialDAO.update(editorial);
    }

    public void updateEditorial(Editorial editorial){
       editorialDAO.update(editorial);
    }

    public void closeResources(){
        editorialDAO.closeResources();
    }

}
