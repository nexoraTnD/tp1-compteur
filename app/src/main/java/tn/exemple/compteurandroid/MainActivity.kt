package tn.exemple.compteurandroid

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    // 5. Variable entiere du compteur, initialisee a 0
    private var compteur = 0

    // Composants graphiques
    private lateinit var textViewCompteur: TextView
    private lateinit var buttonIncrementer: Button
    private lateinit var buttonDecrementer: Button
    private lateinit var buttonReinitialiser: Button
    private lateinit var buttonPlusCinq: Button
    private lateinit var buttonMoinsCinq: Button

    companion object {
        // Cle utilisee pour conserver la valeur lors de la rotation de l'ecran
        private const val CLE_COMPTEUR = "cle_compteur"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 6. Recuperation des composants a partir de leurs identifiants
        textViewCompteur = findViewById(R.id.textViewCompteur)
        buttonIncrementer = findViewById(R.id.buttonIncrementer)
        buttonDecrementer = findViewById(R.id.buttonDecrementer)
        buttonReinitialiser = findViewById(R.id.buttonReinitialiser)
        buttonPlusCinq = findViewById(R.id.buttonPlusCinq)
        buttonMoinsCinq = findViewById(R.id.buttonMoinsCinq)

        // Amelioration : restauration de la valeur apres rotation de l'ecran
        if (savedInstanceState != null) {
            compteur = savedInstanceState.getInt(CLE_COMPTEUR, 0)
        }

        // 7. Programmation du clic sur chaque bouton
        buttonIncrementer.setOnClickListener {
            compteur++
            actualiserAffichage()
        }

        buttonDecrementer.setOnClickListener {
            compteur--
            actualiserAffichage()
        }

        buttonPlusCinq.setOnClickListener {
            compteur += 5
            actualiserAffichage()
        }

        buttonMoinsCinq.setOnClickListener {
            compteur -= 5
            actualiserAffichage()
        }

        buttonReinitialiser.setOnClickListener {
            compteur = 0
            actualiserAffichage()
            Toast.makeText(this, R.string.message_reinitialisation, Toast.LENGTH_SHORT).show()
        }

        // Affichage initial : le compteur vaut 0 au demarrage
        actualiserAffichage()
    }

    /**
     * 8. Actualise le TextView apres chaque modification de la variable compteur.
     * La couleur depend du signe de la valeur (amelioration facultative).
     */
    private fun actualiserAffichage() {
        textViewCompteur.text = compteur.toString()

        val couleur = when {
            compteur > 0 -> R.color.compteur_positif
            compteur < 0 -> R.color.compteur_negatif
            else -> R.color.compteur_nul
        }
        textViewCompteur.setTextColor(ContextCompat.getColor(this, couleur))
    }

    // Conservation de la valeur lors d'un changement de configuration (rotation)
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(CLE_COMPTEUR, compteur)
    }
}
