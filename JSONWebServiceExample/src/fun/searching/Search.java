package fun.searching;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Search {
	
	/*public ArrayList<ArrayList<String>> Linhas(){
		ArrayList<ArrayList<String>> ret = new ArrayList<ArrayList<String>>();
		ArrayList<String> aux;
		for(int i = 0;i<=10;i++){
			aux=new ArrayList<String>();
			aux.add("Ola");
			aux.add("Batatas");
			aux.add("arroz");
			aux.add("lol");
			aux.add("pum");
			aux.add("foste");
			ret.add(aux);
		}
		return ret;
	}*/

	public static ArrayList<String> Linhas2(String f){
		ArrayList<String> aux;
			aux=new ArrayList<String>();
			aux.add("Ola");
			aux.add("Batatas");
			aux.add("arroz");
			aux.add("lol");
			aux.add("pum");
			aux.add("foste");
			aux.add(f);
		return aux;
	}
}
