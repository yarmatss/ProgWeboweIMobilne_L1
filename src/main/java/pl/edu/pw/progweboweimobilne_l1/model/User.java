package pl.edu.pw.progweboweimobilne_l1.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class User {

    @NotEmpty(message = "Imię jest wymagane")
    private String name;

    @NotEmpty(message = "Email jest wymagany")
    @Email(message = "Niepoprawny format email")
    private String email;

    @NotEmpty(message = "Wiadomość jest wymagana")
    @Size(min = 10, message = "Wiadomość musi mieć co najmniej 10 znaków")
    private String message;

    @NotEmpty(message = "Hasło jest wymagane")
    @Size(min = 8, message = "Hasło musi mieć co najmniej 8 znaków")
    private String password;
}
