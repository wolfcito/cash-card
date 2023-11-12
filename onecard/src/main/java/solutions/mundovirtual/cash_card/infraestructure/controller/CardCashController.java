package solutions.mundovirtual.cash_card.infraestructure.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import solutions.mundovirtual.cash_card.domain.CashCard;

@RestController
@RequestMapping("/cashcards")
public class CardCashController {

	@GetMapping("/{requestedId}")
	public ResponseEntity<CashCard> findById() {
		CashCard cashCard = new CashCard(99L, 123.45);
		return ResponseEntity.ok(cashCard);
	}
}