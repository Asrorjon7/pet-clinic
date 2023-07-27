package uz.brogrammers.service;

import uz.brogrammers.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);
}
