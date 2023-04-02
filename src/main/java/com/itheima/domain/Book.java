package com.itheima.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//lombok注解
@Data//包含Getter,Setter,ToString,EqualsAndHashCode
@NoArgsConstructor//无参构造函数
@AllArgsConstructor//包含全部参数的构造函数
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;


  /* public Book() {
    }

    public Book(Integer id, String type, String name, String description) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
    }*/

  /*  *
     * 获取
     * @return id

    public Integer getId() {
        return id;
    }

   *
     * 设置
     * @param id

    public void setId(Integer id) {
        this.id = id;
    }

   *
     * 获取
     * @return type

    public String getType() {
        return type;
    }

    *
     * 设置
     * @param type

    public void setType(String type) {
        this.type = type;
    }

    *
     * 获取
     * @return name

    public String getName() {
        return name;
    }

    *
     * 设置
     * @param name

    public void setName(String name) {
        this.name = name;
    }

    *
     * 获取
     * @return description

    public String getDescription() {
        return description;
    }

    *
     * 设置
     * @param description

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Book{id = " + id + ", type = " + type + ", name = " + name + ", description = " + description + "}";
    }*/
}
