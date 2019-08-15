package Controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import Entity.helloworld;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {
	@Autowired
	SessionFactory sessionFactory;

	public String deFault() {
		Session session = sessionFactory.getCurrentSession();
		String SQL = "select word from helloworld";
		List<helloworld> list = session.createQuery(SQL).getResultList();
		for (helloworld helloworld : list) {
			System.out.print(helloworld.getWord() + ",");
		}
		return "trangchu";
	}
}
