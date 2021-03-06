package com.github.akshatdev0.swapi.starwars.person;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePerson.class)
@JsonDeserialize(as = ImmutablePerson.class)
public interface Person {

  String id();

  String name();

  String birthYear();

  String gender();

  int height();

  float mass();

  String eyeColor();

  String hairColor();

  String skinColor();

  String created();

  String edited();
}
