package com.daiyior.cardatabase;
import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.daiyior.cardatabase.domain.AppUser;
import com.daiyior.cardatabase.domain.AppUserRepository;
import com.daiyior.cardatabase.domain.Car;
import com.daiyior.cardatabase.domain.CarRepository;
import com.daiyior.cardatabase.domain.Owner;
import com.daiyior.cardatabase.domain.OwnerRepository;
@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

	private final AppUserRepository urepository;
	private final CarRepository repository;
	private final OwnerRepository orepository;

	public CardatabaseApplication(CarRepository repository, 
OwnerRepository orepository, AppUserRepository urepository) {
 this.repository = repository;
 this.orepository = orepository;
 this.urepository = urepository;
}

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Add owner objects and save these to db
		Owner owner1 = new Owner("Neo", "Anderson");
Owner owner2 = new Owner("Trinity", "Matrix");
Owner owner3 = new Owner("Morpheus", "Matrix");
Owner owner4 = new Owner("Agent", "Smith");
Owner owner5 = new Owner("Oracle", "Matrix");
Owner owner6 = new Owner("Niobe", "Matrix");
Owner owner7 = new Owner("Persephone", "Matrix");
Owner owner8 = new Owner("Councillor", "Hamann");
Owner owner9 = new Owner("Mifune", "Matrix");
Owner owner10 = new Owner("Sparks", "Matrix");
Owner owner11 = new Owner("Shimada", "Matrix");
Owner owner12 = new Owner("Apoc", "Matrix");
Owner owner13 = new Owner("Dozer", "Matrix");
Owner owner14 = new Owner("Cypher", "Matrix");
Owner owner15 = new Owner("Switch", "Matrix");
Owner owner16 = new Owner("Mouse", "Matrix");
Owner owner17 = new Owner("Tank", "Matrix");
Owner owner18 = new Owner("Keymaker", "Matrix");
Owner owner19 = new Owner("Seraph", "Matrix");
Owner owner20 = new Owner("Sati", "Matrix");
orepository.saveAll(Arrays.asList(owner1, owner2,owner3,
 owner4,owner5, owner6, owner7,owner8,
owner9, owner10,
owner11, owner12,owner13,
owner14,owner15,
owner16,owner17, owner18, owner19,
owner20));		


			
repository.save(new Car("Volvo", "S90", "Black", "ABC123", 2024, 58900, owner1));
repository.save(new Car("Volvo", "V60", "Blue", "DEF456", 2024, 50845, owner2));
repository.save(new Car("Volvo", "XC40", "Red", "GHI789", 2024, 41295, owner3));
repository.save(new Car("Volvo", "XC40 Recharge", "White", "JKL012", 2024, 50000, owner4));
repository.save(new Car("Volvo", "C40 Recharge", "Silver", "MNO345", 2024, 54795, owner5));

repository.save(new Car("Porsche", "718 Boxster", "Green", "PQR678", 2024, 72050, owner6));
repository.save(new Car("Porsche", "718 Cayman", "Yellow", "STU901", 2024, 69950, owner7));
repository.save(new Car("Porsche", "911", "Red", "VWX234", 2024, 116050, owner8));
repository.save(new Car("Porsche", "Cayenne", "White", "YZA567", 2024, 80850, owner9));
repository.save(new Car("Porsche", "Macan", "Blue", "BCD890", 2024, 62550, owner10));

repository.save(new Car("BMW", "3 Series", "Black", "EFG123", 2024, 41000, owner11));
repository.save(new Car("BMW", "5 Series", "White", "HIJ456", 2024, 53000, owner12));
repository.save(new Car("BMW", "7 Series", "Silver", "KLM789", 2024, 86000, owner13));
repository.save(new Car("BMW", "X3", "Red", "NOP012", 2024, 43000, owner14));
repository.save(new Car("BMW", "X5", "Blue", "QRS345", 2024, 59000, owner15));

repository.save(new Car("Volvo", "XC60", "Black", "TUV678", 2024, 41250, owner16));
repository.save(new Car("Porsche", "Macan GTS", "White", "WXY901", 2024, 88450, owner17));
repository.save(new Car("Porsche", "Macan Turbo", "Silver", "ZAB234", 2021, 85950, owner18));
repository.save(new Car("BMW", "X7", "Red", "CDE567", 2024, 74000, owner19));
repository.save(new Car("BMW", "Z4", "Blue", "FGH890", 2024, 49000, owner20));
		
		
		// Fetch all cars and log to console
		for (Car car : repository.findAll()) {
			logger.info("brand: {}, model: {}", car.getBrand(), car.getModel());
		}
// Username: user, password: user
urepository.save(new AppUser("user", "$2a$10$NVM0n8ElaRgg7zWO1CxUdei7vWoPg91Lz2aYavh9.f9q0e4bRadue", "USER"));
// Username: admin, password: admin
urepository.save(new AppUser("admin","$2a$10$8cjz47bjbR4Mn8GMg9IZx.vyjhLXR/SKKMSZ9.mP9vpMu0ssKi8GW", "ADMIN"));

	}

	
}