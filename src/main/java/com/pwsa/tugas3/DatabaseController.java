/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pwsa.tugas3;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class DatabaseController {
    
    @CrossOrigin
@GetMapping(value = "xml/mahasiswa", produces = {
    MediaType.APPLICATION_XML_VALUE
}
)
@ResponseBody
public List<Mahasiswa> getMahasiswa(){

List<Mahasiswa> Mahasiswa = new ArrayList<>();

MahasiswaJpaController controller = new MahasiswaJpaController();

try{
Mahasiswa = controller.findMahasiswaEntities();
} catch (Exception e){}

return Mahasiswa;

}

@CrossOrigin
@GetMapping(value = "json/mahasiswa", produces = {
    MediaType.APPLICATION_JSON_VALUE
}
)
@ResponseBody
public List<Mahasiswa> getdataMahasiswa(){

List<Mahasiswa> Mahasiswa = new ArrayList<>();

MahasiswaJpaController controller = new MahasiswaJpaController();

try{
Mahasiswa = controller.findMahasiswaEntities();
} catch (Exception e){}

return Mahasiswa;

}

}
