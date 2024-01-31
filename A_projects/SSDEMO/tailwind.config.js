/** @type {import('tailwindcss').Config} */
module.exports = {
    content: ["./*.{html,js}", "./!(build|dist|.*)/**/*.{html,js}"],
    theme: {
      extend: {
        colors: {
          gray: "rgba(255, 255, 255, 0.83)",
          white: "#fff",
          black: "#000",
        },
        spacing: {},
        fontFamily: {
          inter: "Inter",
        },
      },
      fontSize: {
        "6xl": "1.56rem",
        inherit: "inherit",
      },
    },
    corePlugins: {
      preflight: false,
    },
  };
  