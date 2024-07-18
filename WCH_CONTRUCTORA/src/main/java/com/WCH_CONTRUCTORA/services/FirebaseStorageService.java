/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.WCH_CONTRUCTORA.services;

import org.springframework.web.multipart.MultipartFile;

/**
 @author migue
 */
public interface FirebaseStorageService {
   
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "wch-constructora.appspot.com";

    //Esta es la ruta básica de este proyecto Prueba_a
    final String rutaSuperiorStorage = "WCH CONSTRUCTORA";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "wch-constructora-firebase-adminsdk-ud7sl-869d577c1c.json";
}
