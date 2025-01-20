package br.com.gmalheiro.java_caching.entity;

import java.io.Serializable;

public record Product(Long id, String name, String description) implements Serializable {
}
