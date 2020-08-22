package id.mentoring.kotlin2.models

import id.mentoring.kotlin2.R

object HeroesData {
    private val heroNames = arrayOf("Ahmad Dhoni",
        "Rani Maharani",
        "Zaskia Yuli",
        "Komalasari",
        "Linda Puji",
        "Indah Dewi",
        "Robbert")

    private val heroDetails = arrayOf(
        "Dokter Spesialis Jantung\nLulusan Universitas Gajah Mada",
        "Dokter Spesialis Kecantikan\nLulusan Universitas Gajah Mada",
        "Dokter Spesialis Paru Paru\nLulusan Universitas Gajah Mada",
        "Dokter Spesialis Umum\nLulusan Universitas Gajah Mada",
        "Dokter Spesialis Syaraf\nLulusan Universitas Gajah Mada",
        "Dokter Spesialis Gigi\nLulusan Universitas Gajah Mada",
        "Dokter Spesialis Mata\nLulusan Universitas Gajah Mada"
    )

    private val heroesImages = intArrayOf(
        R.drawable.hero1,
        R.drawable.hero2,
        R.drawable.hero3,
        R.drawable.hero4,
        R.drawable.hero5,
        R.drawable.hero6,
        R.drawable.hero7)

    val listData: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (position in heroNames.indices) {
                val hero = Hero()
                hero.name = heroNames[position]
                hero.detail = heroDetails[position]
                hero.photo = heroesImages[position]
                list.add(hero)
            }
            return list
        }
}