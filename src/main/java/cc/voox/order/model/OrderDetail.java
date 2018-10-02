package cc.voox.order.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class OrderDetail {

    @Id
    @GeneratedValue
    @JsonProperty("id")
    private Integer oid;

    private String name;

}
