package com.example.mainactivitty.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.mainactivitty.model.Mahasiswa

@Composable
fun DetailMahasiswa(
    datamhs: Mahasiswa
){
    val  listDatamhs = listOf(
        Pair("nama", datamhs.nama),
        Pair("Gender", datamhs.nama),
        Pair("Alamat", datamhs.nama),
    )

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        listDatamhs.forEach { data ->
            DetailMhs(judul = data.first,
                isi = data.second
                )
        }
    }
}

@Composable
fun DetailMhs(
    judul: String,isi: String
){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(15.dp)
    ){
        Text(text = judul,
            modifier = Modifier.weight(0.8f))
        Text(text = ":",
            modifier = Modifier.weight(0.2f))
        Text(text = isi,
            modifier = Modifier.weight(2f))
    }
}
