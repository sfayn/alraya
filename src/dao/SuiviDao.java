/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;
import bean.Suivi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MoulayYounesSama
 */
public class SuiviDao {

    private List<Suivi> suivis = new ArrayList<Suivi>();
public int save(Suivi suivi) throws SQLException{
		String requete = "INSERT INTO suivi(`code`, `risque`, `motif`, `attention`," +
                " `observation`, `bloque`, `type`,`dateSuivi`,`interesse`) VALUES("+suivi.getCode()+", "+suivi.getRisque()+", '"+
                suivi.getMotif()+"', '"+suivi.getAttention()+"', '"+suivi.getObservation()+"' , "
                +suivi.getBloque()+",'"+suivi.getType()+"','"+suivi.getDateSuivi()+"','"+suivi.getInteresse()+"')";
        System.out.println(requete);
		return Connect.exec(requete);
	}


//public List<Suivi> loadAll(String type,int bloque ) throws SQLException{
//		ResultSet suivisResultSet = Connect.loadAll("Select * from suivi where type='"+type+"' and bloque="+bloque);
//        suivis.clear();
//		Suivi suivi;
//		while(suivisResultSet.next()){
//			suivi = new Suivi();
////			suivi.setId(suivisResultSet.getInt("id"));
//			suivi.setCode(suivisResultSet.getInt("code"));
//            suivi.setRisque(suivisResultSet.getInt("risque"));
//            suivi.setMotif(suivisResultSet.getString("motif"));
//            suivi.setAttention(suivisResultSet.getString("attention"));
//            suivi.setObservation(suivisResultSet.getString("interesse"));
////            suivi.setBloque(suivisResultSet.getInt("bloque"));
//            suivi.setType(suivisResultSet.getString("type"));
//
//  			suivis.add(suivi);
//		}
//
//		suivisResultSet.close();
//        return suivis;
//
//	}
//public List<Suivi> loadAll(int bloque ) throws SQLException{
//		ResultSet suivisResultSet = Connect.loadAll("Select * from suivi where bloque="+bloque);
//        suivis.clear();
//		Suivi suivi;
//		while(suivisResultSet.next()){
//			suivi = new Suivi();
////			suivi.setId(suivisResultSet.getInt("id"));
//			suivi.setCode(suivisResultSet.getInt("code"));
//            suivi.setRisque(suivisResultSet.getInt("risque"));
//            suivi.setMotif(suivisResultSet.getString("motif"));
//            suivi.setAttention(suivisResultSet.getString("attention"));
//            suivi.setObservation(suivisResultSet.getString("observation"));
//            suivi.setDateSuivi(suivisResultSet.getString("dateSuivi"));
//             suivi.setInteresse(suivisResultSet.getString("interesse"));
//         //   System.out.println("ana f loadAll int blmoque et la val de date est ");
////            suivi.setBloque(suivisResultSet.getInt("bloque"));
//            suivi.setType(suivisResultSet.getString("type"));
//
//  			suivis.add(suivi);
//		}
//
//		suivisResultSet.close();
//        return suivis;
//
//	}

public List<Suivi> loadAll(String requette) throws SQLException{
//    System.out.println("je ss dans load all et la req ="+requette);
		ResultSet suivisResultSet = Connect.loadAll(requette);
        suivis.clear();
		
		while(suivisResultSet.next()){
			Suivi suivi = new Suivi();
//			suivi.setId(suivisResultSet.getInt("id"));
			suivi.setCode(suivisResultSet.getInt("code"));
            suivi.setRisque(suivisResultSet.getInt("risque"));
            suivi.setMotif(suivisResultSet.getString("motif"));
            suivi.setAttention(suivisResultSet.getString("attention"));
            suivi.setDateSuivi(suivisResultSet.getString("dateSuivi"));
   //         suivi.setObservation(suivisResultSet.getString("observation"));
   //         suivi.setBloque(suivisResultSet.getInt("bloque"));
            suivi.setInteresse(suivisResultSet.getString("interesse"));
            suivi.setType(suivisResultSet.getString("type"));

  			suivis.add(suivi);
		}

		suivisResultSet.close();
        return suivis;

	}

}
