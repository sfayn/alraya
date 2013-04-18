/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.Client;
import dao.ClientDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MoulayYounesSama
 */
public class CatalogueListClient  extends AbstractTableModel{
private String[] titres = {"Code","Societe","Forme Juridique","Personne a contacter","Adresse","Tel","Statut"};
    private List<Client> clients = new ArrayList<Client>();
    private ClientDao clientDao = new ClientDao();

 



    public int getRowCount() {
        return clients.size();
    }

    public int getColumnCount() {
        return titres.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
         if(rowIndex<clients.size()){
             switch(columnIndex){
                case 0: return clients.get(rowIndex).getCode();
                 case 1: return clients.get(rowIndex).getSociete();
                 case 2:return clients.get(rowIndex).getFormeJuridique();
                 case 3: return clients.get(rowIndex).getPersonneContacter();
                 case 4:return clients.get(rowIndex).getAdress1();
                 case 5:return clients.get(rowIndex).getTelStandard();
                 case 6:return clients.get(rowIndex).getStatut();

             }
         }
            return null;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public Client getValueAt(int rowIndex) {
        if(rowIndex<clients.size()){
           return clients.get(rowIndex);
        }
        else
            return null;
    }
    @Override
    public String getColumnName(int columnIndex){
        return titres[columnIndex];
    }

    public String[] getTitres() {
        return titres;
    }

    public void setTitres(String[] titres) {
        this.titres = titres;
    }


    public CatalogueListClient() {
      try {
            clients = clientDao.loadAll();

        } catch (SQLException ex) {
        }
    }

     public void updateClient(Integer code) {
        for (int i = 0; i < clients.size(); i++) {
              if(clients.get(i).getCode()==code){
            clients.get(i).setStatut("Actif");
              }

                }
     }

}
