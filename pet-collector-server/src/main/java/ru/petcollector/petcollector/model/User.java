package ru.petcollector.petcollector.model;

import java.util.List;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Document("users")
@NoArgsConstructor
public class User extends AbstractModel {

    @NotNull
    private String lastName;

    @NotNull
    private String firstName;

    @Nullable
    private String midleName;

    @NotNull
    private String phoneNumber;

    @NotNull
    @Indexed(unique = true)
    private String login;

    @Nullable
    @JsonIgnore
    private String password;

    // @Nullable
    // @ReadOnlyProperty
    // @DocumentReference(lookup = "{'debtorId':?#{#self._id} }")
    // private List<Debt> reqDebts;

    // @Nullable
    // @ReadOnlyProperty
    // @DocumentReference(lookup = "{'ownerId':?#{#self._id} }")
    // private List<Debt> ownDebts;

}
