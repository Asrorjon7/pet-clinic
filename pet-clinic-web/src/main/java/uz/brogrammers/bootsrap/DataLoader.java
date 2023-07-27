package uz.brogrammers.bootsrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uz.brogrammers.model.Owner;
import uz.brogrammers.model.Vet;
import uz.brogrammers.service.OwnerService;
import uz.brogrammers.service.VetService;
@Component
public class DataLoader implements CommandLineRunner {
     private final OwnerService ownerService;
     private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstName("Micheal");
        owner.setLastName("Weston");
        ownerService.save(owner);

        Owner ownerTwo =new Owner();
        ownerTwo.setId(2L);
        ownerTwo.setFirstName("Fiona");
        ownerTwo.setLastName("Glenanne");
        ownerService.save(ownerTwo);
        System.out.println("Loaded  Owners ...");

        Vet vet =new Vet();
        vet.setId(1L);
        vet.setFirstName("Sam");
        vet.setLastName("Axe");
        vetService.save(vet);

        Vet vetTwo =new Vet();
        vetTwo.setId(2L);
        vetTwo.setFirstName("Jessie");
        vetTwo.setLastName("Porter");
        vetService.save(vetTwo);
        System.out.println("Loaded Vets ...");

    }
}
