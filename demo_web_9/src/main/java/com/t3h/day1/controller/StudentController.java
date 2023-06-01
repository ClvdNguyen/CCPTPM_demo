//package com.t3h.day1.controller;
//
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.t3h.day1.dto.StudentDto;
//import com.t3h.day1.entity.Student;
//import com.t3h.day1.model.StudentRequestVO;
//import com.t3h.day1.service.StudentService;
//
//@RestController
//@RequestMapping("/student")
//public class StudentController {
//
//	@Autowired
//	private StudentService studentService;
//	
//	@GetMapping("")
//	public List<Student> getStudents(@RequestParam("pageNum") Integer pageNum, 
//			@RequestParam("pageSize") Integer pageSize) {
//		
//		Pageable pageable = PageRequest.of(pageNum, pageSize);
//		return studentService.getStudent(pageable);
//	}
//	
//	@GetMapping("/totalCount")
//	public List<Map<String, String>> getTotalCount() {
//		return studentService.getTotalPoint();
//	}
//	
//	@GetMapping("/{id}")
//	public StudentDto getStudent(@PathVariable Long id) {
//		int i = 1/0;
//		return studentService.getStudentById(id);
//	}
//	
//	@PutMapping("/{id}")
//	public Student updateStudent(@PathVariable Long id, @RequestBody StudentRequestVO req) {
//		return studentService.updateStudent(id, req);
//	}
//	
//	@PostMapping("")
//	public Student createStudent(@RequestBody StudentRequestVO req) {
//		return studentService.createStudent(req);
//	}
//	
//	@DeleteMapping("/{id}")
//	public String deleteStudent(@PathVariable Long id) {
//		studentService.deleteStudent(id);
//		return "OK";
//	}
//	
//	
//	
////	private static List<Student> students = new ArrayList<Student>();
////
////	static {
////		students.add(new Student("phu", "Dinh"));
////	}
////	private String message = "Hello T3H";
////
////	private String errorMessage = "First Name & Last Name is required!";
////
////	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
////	public String index(Model model) {
////		model.addAttribute("message", message);
////		return "index";
////	}
////
////	@RequestMapping(method = RequestMethod.GET, value = "students")
////	public String getStudents(Model model) {
////		model.addAttribute("students", students);
////
////		return "students";
////	}
////
////	@RequestMapping(value = { "/addStudent" }, method = RequestMethod.GET)
////	public String showAddStudentPage(Model model) {
////
////		StudentAddRequestVO form = new StudentAddRequestVO();
////		model.addAttribute("form", form);
////
////		return "addStudent";
////	}
////
////	@RequestMapping(value = { "/addStudent" }, method = RequestMethod.POST)
////	public String savePerson(Model model, //
////			@ModelAttribute("form") StudentAddRequestVO form) {
////
////		String firstName = form.getFirstName();
////		String lastName = form.getLastName();
////
////		if (firstName != null && firstName.length() > 0 //
////				&& lastName != null && lastName.length() > 0) {
////			Student student = new Student(firstName, lastName);
////			students.add(student);
////			return "redirect:/student/students";
////		}
////
////		model.addAttribute("errorMessage", errorMessage);
////		return "addStudent"; 
////	}
//
//}
