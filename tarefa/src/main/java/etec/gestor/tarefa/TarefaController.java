package etec.gestor.tarefa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import etec.gestor.tarefa.entity.Tarefa;
import etec.gestor.tarefa.repository.TarefaRepository;

@Controller
public class TarefaController {
	
	@Autowired
	TarefaRepository repository;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("cadastrotarefa")
	public String cadastrotarefa() {
		return "cadastrotarefa";
	}
	
	@RequestMapping(value = "/editar", method = RequestMethod.GET)
	public ModelAndView  editarTarefa(Tarefa tarefa) {
		ModelAndView view = new ModelAndView("editar");
		Optional<Tarefa> tarefaOp =  repository.findById(tarefa.getId());
		view.addObject("tarefa", tarefaOp.get());
		return view;
	}
	
	@RequestMapping(value = "/salvatarefa", method = RequestMethod.GET)
	public String salvaTarefa(Tarefa tarefa) {
		repository.save(tarefa);
		return "cadastrotarefa";
	}  
	
	@RequestMapping(value = "/listartarefa", method = RequestMethod.GET)
	public ModelAndView listaTarefas(){
		ModelAndView view = new ModelAndView("lista_tarefa");
		List<Tarefa> listaTarefa  = repository.findAll() ;
		view.addObject("tarefas", listaTarefa);
		return view;
	}
}
