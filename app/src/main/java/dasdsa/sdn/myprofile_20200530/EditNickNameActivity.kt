package dasdsa.sdn.myprofile_20200530

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nick_name.*

class EditNickNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nick_name)


        okBtn.setOnClickListener {
            //바꾸려는 닉네임을 받아서 => 결과로`
            val nick = nickNameEdt.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("nickName", nick)

            setResult(Activity.RESULT_OK, resultIntent)

            finish()

        }
    }
}
