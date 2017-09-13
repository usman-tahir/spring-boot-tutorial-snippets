
@RestController
class Application {
	@RequestMapping("/")
	String home() {
		"Hello World!";
	}

	@RequestMapping("/goodbye")
	String goodbye() {
		"Goodbye World!";
	}
}