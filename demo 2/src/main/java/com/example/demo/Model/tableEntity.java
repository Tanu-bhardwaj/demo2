package com.example.demo.Model;

import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.TypeDef;


@Data
@Entity
@Table(name = "test")
public class tableEntity extends parent {

  @Column(name = "name", unique = true, nullable = false)
  private String name;

  @Column(name = "nick_name", nullable = false)
  private String nickName;
}
