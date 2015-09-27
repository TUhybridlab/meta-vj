include recipes-core/images/rpi-hwup-image.bb

IMAGE_INSTALL += "openssh \
                  vj-control-server \
"

IMAGE_LINGUAS = "en-us"

export IMAGE_BASENAME = "image-vj-control-server"
