package com.ankit.rest.webservices.restfulwebservices.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningController {


    @GetMapping("/v1/person")
    public Person getName() {
        return new Person("Ankit Dhaka");
    }

    @GetMapping("/v2/person")
    public PersonV2 getNameV2() {
        return new PersonV2(new Name("Ankit", "Dhaka"));
    }

    @GetMapping(value = "/person", params = "version=1")
    public Person getNameRequestParamV1() {
        return new Person("Bhavik Dhaka");
    }

    @GetMapping(value = "/person", params = "version=2")
    public PersonV2 getNameRequestParamV2() {
        return new PersonV2(new Name("Bhavik", "Dhaka"));
    }

    @GetMapping(value = "/person/header", headers = "X-API-VERSION=1")
    public Person getNameByVersioningOnHeaderV1() {
        return new Person("Bhavik Dhaka");
    }

    @GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 getNameByVersioningOnHeaderV2() {
        return new PersonV2(new Name("Bhavik", "Dhaka"));
    }

    @GetMapping(value = "/person/accept", produces = "application/vnd.company.app-v1+json")
    public Person getNameByVersioningOnAcceptHeaderV1() {
        return new Person("Bhavik Dhaka");
    }

    @GetMapping(value = "/person/accept", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getNameByVersioningOnAcceptHeaderV2() {
        return new PersonV2(new Name("Bhavik", "Dhaka"));
    }

}
