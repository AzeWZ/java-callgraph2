package com.adrninistrator.javacg.dto.classes;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
@NodeEntity
public class ClassInfo {
    @Id @GeneratedValue
    private Long id;

    private String className;

    private Integer accessFlags;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getAccessFlags() {
        return accessFlags;
    }

    public void setAccessFlags(Integer accessFlags) {
        this.accessFlags = accessFlags;
    }
}
