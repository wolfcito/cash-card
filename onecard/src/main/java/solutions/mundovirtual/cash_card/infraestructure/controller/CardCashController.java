package solutions.mundovirtual.cash_card.infraestructure.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cashcards")
public class CardCashController {

	@GetMapping("/{requestedId}")
	public ResponseEntity<String> findById() {
		return ResponseEntity.ok("{}");
	}
}