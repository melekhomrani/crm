package tn.esprit.crm.DTO;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String fname;
    private String lname;
    private String email;
    private String password;

}
