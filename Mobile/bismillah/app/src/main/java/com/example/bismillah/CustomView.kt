package com.example.bismillah

import android.content.Context
import android.content.Intent
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.RectF
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import androidx.core.content.ContextCompat

class CustomView(context: Context, attributeSet: AttributeSet): View(context, attributeSet) {

    val radius = 140f
    val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    val paintCircle = Paint(Paint.ANTI_ALIAS_FLAG)
    val textPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    val normalTextPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    val bioTextPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    val linkTextPaint = Paint(Paint.ANTI_ALIAS_FLAG)
    lateinit var vectorDrawable: Drawable
    lateinit var vectorDrawable2: Drawable
    lateinit var vectorDrawable3: Drawable
    lateinit var vectorDrawable4: Drawable
    lateinit var vectorDrawable5: Drawable
    lateinit var vectorDrawable6: Drawable
    val buttonRect = RectF()
    private var followingBounds = Rect()
    private var jmlFollowingBounds = Rect()

    init {
        textPaint.apply {
            color = Color.BLACK
            textSize = 50f
            textAlign = Paint.Align.LEFT
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
        }
        normalTextPaint.apply {
            color = Color.DKGRAY
            textSize = 40f
            textAlign = Paint.Align.LEFT
        }
        bioTextPaint.apply {
            color = Color.BLACK
            textSize = 40f
            textAlign = Paint.Align.LEFT
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
        }
        linkTextPaint.apply {
            color = Color.parseColor("#87CEFA")
            textSize = 40f
            textAlign = Paint.Align.LEFT
            typeface = Typeface.create(Typeface.DEFAULT, Typeface.BOLD)
        }
        vectorDrawable = ContextCompat.getDrawable(context, R.drawable.baseline_badge_24)!!
        vectorDrawable2 = ContextCompat.getDrawable(context, R.drawable.baseline_add_location_24)!!
        vectorDrawable3 = ContextCompat.getDrawable(context, R.drawable.baseline_calendar_month_24)!!
        vectorDrawable4 = ContextCompat.getDrawable(context, R.drawable.baseline_link_24)!!
        vectorDrawable5 = ContextCompat.getDrawable(context, R.drawable.baseline_arrow_back_241)!!
        vectorDrawable6 = ContextCompat.getDrawable(context, R.drawable.baseline_more_vert_24)!!
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        paint.color = Color.BLUE
        canvas?.drawRect(0f, 0f, width - 0f, height - 1800f, paint)

        val backX = 45f
        val backY = 40f
        val backWidth = 70
        val backHeight = 70
        vectorDrawable5.setBounds(backX.toInt(), backY.toInt(), backX.toInt() + backWidth, backY.toInt() + backHeight)
        vectorDrawable5.draw(canvas)

        val moreX = width - 85f
        val moreY = 40f
        val moreWidth = 70
        val moreHeight = 70
        vectorDrawable6.setBounds(moreX.toInt(), moreY.toInt(), moreX.toInt() + moreWidth, moreY.toInt() + moreHeight)
        vectorDrawable6.draw(canvas)

        paintCircle.color = Color.GRAY
        val circleX = radius + 30f
        val circleY = height - radius - 1700f
        canvas?.drawCircle(circleX, circleY, radius, paintCircle)

        val textY = circleY + radius + 60f
        val textX = circleX - radius
        canvas.drawText("Laura Zakkia", textX, textY, textPaint)

        val textY2 = textY + 55f
        canvas.drawText("@laurazakkia", textX, textY2, normalTextPaint)

        val textY3 = textY2 + 70f
        canvas.drawText("Jangan Lupa Sholat, DM For Support !", textX, textY3, bioTextPaint)

        val badgeX = textX
        val badgeY = textY3 + 40f
        val badgeWidth = 50
        val badgeHeight = 50
        vectorDrawable.setBounds(badgeX.toInt(), badgeY.toInt(), badgeX.toInt() + badgeWidth, badgeY.toInt() + badgeHeight)
        vectorDrawable.draw(canvas)

        val verY4 = badgeX + 70f
        val horiY4 = textY3 + 80f
        canvas.drawText("Advertising & Marketing Agency", verY4, horiY4, normalTextPaint)

        val locX = textX
        val locY = badgeY + badgeHeight + 20f
        val locWidth = 50
        val locHeight = 50
        vectorDrawable2.setBounds(locX.toInt(), locY.toInt(), locX.toInt() + locWidth, locY.toInt() + locHeight)
        vectorDrawable2.draw(canvas)

        val loctextX = locX + 70f
        val loctextY = horiY4 + 70f
        canvas.drawText("Jakarta, Indonesia", loctextX, loctextY, normalTextPaint)

        val linkX = loctextX + 390f
        val linkY = locY
        val linkWidth = 50
        val linkHeight = 50
        vectorDrawable4.setBounds(linkX.toInt(), linkY.toInt(), linkX.toInt() + linkWidth, linkY.toInt() + linkHeight)
        vectorDrawable4.draw(canvas)

        val linktextX = linkX + 70f
        val linktextY = linkY + 40f
        canvas.drawText("Https://laurazakkia..", linktextX, linktextY, linkTextPaint)

        val calX = textX
        val calY = locY + locHeight + 20f
        val calWidth = 50
        val calHeight = 50
        vectorDrawable3.setBounds(calX.toInt(), calY.toInt(), calX.toInt() + calWidth, calY.toInt() + calHeight)
        vectorDrawable3.draw(canvas)

        val caltextX = calX + 70f
        val caltextY = loctextY + 70f
        canvas.drawText("Joined May, 2010", caltextX, caltextY, normalTextPaint)

        val jmlFollowingX = circleX - radius
        val jmlFollowingY = caltextY + 70f
        canvas.drawText("1150", jmlFollowingX, jmlFollowingY, bioTextPaint)
        bioTextPaint.getTextBounds("1150", 0, "1150".length, jmlFollowingBounds)
        jmlFollowingBounds.offset(jmlFollowingX.toInt(), jmlFollowingY.toInt())

        val FollowingX = jmlFollowingX + 115f
        val FollowingY = caltextY + 70f
        canvas.drawText("Following", FollowingX, FollowingY, normalTextPaint)
        normalTextPaint.getTextBounds("Following", 0, "Following".length, followingBounds)
        followingBounds.offset(FollowingX.toInt(), FollowingY.toInt())

        val jmlFollowerX = FollowingX + 250f
        val jmlFollowerY = caltextY + 70f
        canvas.drawText("1111", jmlFollowerX, jmlFollowerY, bioTextPaint)

        val FollowerX = jmlFollowerX + 115f
        val FollowerY = caltextY + 70f
        canvas.drawText("Followers", FollowerX, FollowerY, normalTextPaint)

        val btnEditX = width / 4f + 400f
        val btnEditY = height - radius - 1620f
        val btnEditWidth = 350f
        val btnEditHeight = 100f

        buttonRect.set(btnEditX, btnEditY, btnEditX + btnEditWidth, btnEditY + btnEditHeight)

        paint.color = Color.LTGRAY
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = 3f

        canvas.drawRoundRect(buttonRect, 50f, 50f, paint)

        paint.style = Paint.Style.FILL
        paint.color = Color.BLACK
        paint.textSize = 45f

        paint.color = Color.BLACK
        paint.textSize = 45f
        val buttonText = "Edit Profile"
        val textWidth = paint.measureText(buttonText)
        canvas.drawText(buttonText, buttonRect.centerX() - textWidth / 2, buttonRect.centerY() + 15f, paint)

    }
    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                if (followingBounds.contains(event.x.toInt(), event.y.toInt())) {
                    val intent = Intent(context, FollowingActivity::class.java)
                    context.startActivity(intent)
                    return true
                }

                if (jmlFollowingBounds.contains(event.x.toInt(), event.y.toInt())) {
                    val intent = Intent(context, FollowingActivity::class.java)
                    context.startActivity(intent)
                    return true
                }
            }
        }
        return super.onTouchEvent(event)
    }
}