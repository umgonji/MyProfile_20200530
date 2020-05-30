package dasdsa.sdn.myprofile_20200530

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val REQ_FOR_NICKNAME = 1001

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changenickBtn.setOnClickListener {
            val myIntent = Intent(this, EditNickNameActivity::class.java)
            startActivityForResult(myIntent, REQ_FOR_NICKNAME)

        }

        dialBtn.setOnClickListener {
            val phoneNum = phoneNumEdt.text.toString()

            val myUri = Uri.parse("tel::${phoneNum.replace("-","")}")

            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQ_FOR_NICKNAME){
            if(resultCode == Activity.RESULT_OK) {
                val changedNick = data?.getStringExtra("nickName")

                myNickNameText.text = changedNick
            }
        }
    }
}
