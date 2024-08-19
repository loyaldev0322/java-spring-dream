package first.example.dream.controller;

import org.springframework.http.MediaType;
import first.example.dream.model.Item;
import first.example.dream.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Item createItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }
    @GetMapping("/new")
    public String getNewItem() {
        return "Hello";
    }
}
