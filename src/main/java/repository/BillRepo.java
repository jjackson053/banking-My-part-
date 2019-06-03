package repository;

import model.Bill;
import org.springframework.data.repository.CrudRepository;


public interface BillRepo extends CrudRepository<Bill,Long> {
}
