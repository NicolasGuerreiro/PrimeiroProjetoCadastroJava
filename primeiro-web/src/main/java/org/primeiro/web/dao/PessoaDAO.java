package org.primeiro.web.dao;

import java.util.ArrayList;
import java.util.List;

import org.primeiro.web.model.Pessoa;
import org.springframework.stereotype.Repository;

@Repository
public class PessoaDAO {
	
	private static List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	
	public static void insertPessoa(Pessoa pessoa) {
		listaPessoas.add(pessoa);
	}
	
	public static List<Pessoa> getAll(){
		return listaPessoas;
	}

}
